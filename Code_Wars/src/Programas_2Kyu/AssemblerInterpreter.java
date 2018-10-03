package Programas_2Kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Pattern;
import jdk.nashorn.internal.runtime.regexp.RegExp;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import sun.misc.Regexp;

/**
 *
 * @author A693126
 */
public class AssemblerInterpreter {

    public static Map<String, Integer> registers;
    public static String output;
    public static boolean isEnded;
    public static ListIterator<String> li;
    public static LinkedHashMap<String, Integer> commandMap;
    public static Stack<Integer> indexes;
    public static int comparator;

    public static void reset(){
        registers = new HashMap<>();
        output = "";
        isEnded = false;
        li = null;
        commandMap = new LinkedHashMap<>();
        indexes = new Stack<>();
        comparator = 0;
    }
    public static String interpret(final String input) {
        reset();
        String format = input;

        while (format.contains("  ")) {
            format = format.replaceAll("  ", " ");
        }

        String[] program = format.split("\n");
        ArrayList<String> commands = new ArrayList<>();
        
        for (int i = 0; i < program.length; i++) {
        if(program[i].indexOf(";")!=-1)program[i]=program[i].substring(0, program[i].indexOf(";"));
            //System.out.println(program[i]);
            commandMap.put(program[i], i);
            if(program[i].indexOf("'")!=-1)commands.add(program[i].trim());
            else commands.add(program[i].trim().replaceAll(",", ""));
        }
        
        li = commands.listIterator();
        while (!isEnded) {
            if(li.hasNext())
            executeCommands(li.next());
            else return null;
        }
        //System.out.println("@"+output+"@");
        return output;
    }

    public static void executeCommands(String command) {
        String[] com = command.split(" ");
        switch (com[0]) {
            case "mov":mov(com[1], com[2]);break;
            case "inc":inc(com[1]);break;
            case "dec":dec(com[1]);break;
            case "add":add(com[1], com[2]);break;
            case "sub":sub(com[1], com[2]);break;
            case "mul":mul(com[1], com[2]);break;
            case "div":div(com[1], com[2]);break;
            case "jmp":jmp(com[1]);break;
            case "cmp":cmp(com[1], com[2]);break;
            case "jne":jne(com[1]);break;
            case "je":je(com[1]);break;
            case "jge":jge(com[1]);break;
            case "jg":jg(com[1]);break;
            case "jle":jle(com[1]);break;
            case "jl":jl(com[1]);break;
            case "call":call(com[1]);break;
            case "ret":ret();break;
            case "msg":msg(command);break;
            case "end":isEnded=true;break;
            default:break;
        }
    }

    public static void mov(String reg, String value) {
        if (value.matches("-?[0-9]*")) {
            Integer num = Integer.parseInt(value);
            registers.put(reg, num);
        } else {
            registers.put(reg, registers.get((String) value));
        }
    }

    public static void inc(String reg) {
        registers.put(reg, registers.get(reg) + 1);
    }

    public static void dec(String reg) {
        registers.put(reg, registers.get(reg) - 1);
    }

    public static void add(String reg, String value){
        if (value.matches("-?[0-9]*")) {
            Integer num = Integer.parseInt(value);
            registers.put(reg, registers.get(reg) + num);
        } else {
            registers.put(reg, registers.get(reg) + registers.get((String) value));
        }
    }
    
    public static void sub(String reg, String value){
        if (value.matches("-?[0-9]*")) {
            Integer num = Integer.parseInt(value);
            registers.put(reg, registers.get(reg) - num);
        } else {
            registers.put(reg, registers.get(reg) - registers.get((String) value));
        }
    }
    
    public static void mul(String reg, String value){
        if (value.matches("-?[0-9]*")) {
            Integer num = Integer.parseInt(value);
            registers.put(reg, registers.get(reg) * num);
        } else {
            registers.put(reg, registers.get(reg) * registers.get((String) value));
        }
    }
    
    public static void div(String reg, String value){
        if (value.matches("-?[0-9]*")) {
            Integer num = Integer.parseInt(value);
            registers.put(reg, registers.get(reg) / num);
        } else {
            registers.put(reg, registers.get(reg) / registers.get((String) value));
        }
    }
    
    public static void jmp(String reg){
        int i= commandMap.get(reg+":");
        if(li.nextIndex()>i) while(li.previousIndex()>=i)li.previous();
        else while(li.nextIndex()<=i)li.next();
    }
    
    public static void cmp(String value1, String value2){
        int val1,val2;
        if (value1.matches("-?[0-9]*")) {
            val1 = Integer.parseInt(value1);
        } else {
            val1 = registers.get((String) value1);
        }
        if (value2.matches("-?[0-9]*")) {
            val2 = Integer.parseInt(value2);
        } else {
            val2 = registers.get((String) value2);
        }
        comparator = Integer.compare(val1, val2);
    }
    
    public static void jne(String reg){
        if(comparator!=0){
            int i= commandMap.get(reg+":");
            if(li.nextIndex()>i) while(li.previousIndex()>=i)li.previous();
            else while(li.nextIndex()<=i)li.next();
        }
    }
    
    public static void je(String reg){
        if(comparator==0){
            int i= commandMap.get(reg+":");
            if(li.nextIndex()>i) while(li.previousIndex()>=i)li.previous();
            else while(li.nextIndex()<=i)li.next();
        }
    }
    
    public static void jge(String reg){
        if(comparator>=0){
            int i= commandMap.get(reg+":");
            if(li.nextIndex()>i) while(li.previousIndex()>=i)li.previous();
            else while(li.nextIndex()<=i)li.next();
        }
    }
    
    public static void jg(String reg){
        if(comparator>0){
            int i= commandMap.get(reg+":");
            if(li.nextIndex()>i) while(li.previousIndex()>=i)li.previous();
            else while(li.nextIndex()<=i)li.next();
        }
    }
    
    public static void jle(String reg){
        if(comparator<=0){
            int i= commandMap.get(reg+":");
            if(li.nextIndex()>i) while(li.previousIndex()>=i)li.previous();
            else while(li.nextIndex()<=i)li.next();
        }
    }
    
    public static void jl(String reg){
        if(comparator<0){
            int i= commandMap.get(reg+":");
            if(li.nextIndex()>i) while(li.previousIndex()>=i)li.previous();
            else while(li.nextIndex()<=i)li.next();
        }
    }
    
    public static void call(String reg){
        indexes.push(li.nextIndex());
        int i= commandMap.get(reg+":");
        if(li.nextIndex()>i) while(li.previousIndex()>=i)li.previous();
        else while(li.nextIndex()<=i)li.next();
    }
    
    public static void ret(){
        int index = indexes.pop();
        if(li.nextIndex()>index) while(li.previousIndex()>=index)li.previous();
        else while(li.nextIndex()<=index)li.next();
    }
    
    public static void msg(String msg){
        output="";
        msg=msg.substring(4);
        ArrayList<String> sustituir=new ArrayList<>();
        while(msg.length()>0){
            int ind=msg.indexOf("'");
            if(ind>0){
                sustituir.add(msg.substring(0, ind));
                msg=msg.substring(ind);
            }else if(ind==0){
                sustituir.add(msg.substring(0, msg.indexOf("'", 1)+1));
                msg=msg.substring(msg.indexOf("'", 1)+1);
            }else{
                sustituir.add(msg);
                msg="";
            }
        }
        for(String i:sustituir){
            if(i.startsWith("'"))output=output+i.replaceAll("'", "");
            else output = output + registers.get(Arrays.stream(i.split(",")).map(String::trim).filter(a->!a.equals("")).findFirst().get());
        }
    }
    
}
