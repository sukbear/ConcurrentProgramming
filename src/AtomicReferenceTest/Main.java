package AtomicReferenceTest;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author sukbear
 * @create 2018-12-15 14:18
 */
public class Main {
    public static void main(String[] args) {
        AtomicReference<Person> atomicReferencePerson = new AtomicReference<>();
        Person person = new Person("Jack",20);
        atomicReferencePerson.set(person);
        Person updatePerson = new Person("Tom",22);
        atomicReferencePerson.compareAndSet(person,updatePerson);
        System.out.println(atomicReferencePerson.get().getName()+" "+atomicReferencePerson.get().getAge());
    }
    static  class Person{
        private int age;
        private String name;

        public Person( String name,int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
