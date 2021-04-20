package com.homeWork9;

public class LinkedCollection implements CustomCollection{

    Link first;
    Link last;
    int count = 0;
    Link current;

    public LinkedCollection() {
        first = null;
        last = null;
    }

    @Override
    public boolean add(String str) {
        Link neo = new Link(str);
        if (isEmpty()) {
            first = neo;
        } else {
            last.next = neo;
            neo.prev = last;
        }
        last = neo;
        count++;
        return true;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    @Override
    public boolean addAll(String[] strArr) {
        for (String s : strArr){
            add(s);
        }
        return true;
    }

    @Override
    public boolean addAll(LinkedCollection strColl) {
        Link strFirst = strColl.first;
        Link strLast = strColl.last;
        strFirst.prev = last;
        last.next = strFirst;
        last = strLast;
        return true;
    }

    @Override
    public boolean delete(int index) {
        if (index >= count) {
            return false;
        } else if (index == 0){
            first.next.prev = null;
            first = first.next;
            return true;
        } else if (index == count - 1){
            last.prev.next = null;
            last = last.prev;
            return true;
        } else {
            current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            return true;
        }
    }

    @Override
    public boolean delete(String str) {
        if (!contains(str)){
            return false;
        }
        int index = 0;
        current = first;
        for (int i = 0; i < count; i++ ){
            if (current.link != null && current.link.equals(str)){
                break;
            }
            index++;
            current = current.next;
        }
        return delete(index);
    }

    @Override
    public String get(int index) {
        if (index >= count){
            return "There is no that index";
        }
        current = first;
        for (int i = 0; i <= index; i++){
            if (i == index){
                break;
            }
            current = current.next;
        }
        return current.link;
    }

    @Override
    public boolean contains(String str) {
        current = first;
        for (int i = 0; i < count; i++ ){
            if (current.link != null && current.link.equals(str)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean clear() {
        first = null;
        last = null;
        return true;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean trim() {
        return true;
    }

    @Override
    public boolean compare(LinkedCollection coll) {
        if (count != coll.count){
            return false;
        }
        current = first;
        Link collCurrent = coll.first;
        for (int i = 0; i < count; i++){
            if (!current.equals(collCurrent)){
                return false;
            }
            current = current.next;
            collCurrent = collCurrent.next;
        }
        return true;
    }

    @Override
    public String toString() {
        String out = "";
        current = first;
        while (current != null) {
            out = out.concat(current.link + " ");
            current = current.next;
        }
        return "[" + out + "]";
    }
}
