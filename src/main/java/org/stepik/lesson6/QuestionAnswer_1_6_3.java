package org.stepik.lesson6;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_6_3 {
    /*
     * Вопрос:
     *
     * Develop a class hierarchy of employees. The hierarchy should include three classes:
     * Employee is the base class. It includes three fields (name, email and experience), one constructor with three arguments and three getters: getName(), getEmail(), getExperience().
     * Developer is a subclass. It includes fields from the base class and two additional fields (mainLanguage, skills), one constructor with five arguments and two getters: getMainLanguage(), getSkills().
     * DataAnalyst is another subclass. It includes fields from the base class and two additional fields (phd, methods), one constructor with five arguments and two getters: isPhD(), getMethods().
     * You need to define types of the fields and write suitable constructors. To understand it see the code below.
     *
     * String[] skills = { "git", "Scala", "JBoss", "UML" };
     * Developer developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);
     * String[] mlMethods = { "neural networks", "decision tree", "bayesian algorithms" };
     * DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2, true, mlMethods);
     *
     * It should work correctly with your class hierarchy. Do not forget write getters with the specified name (otherwise the test system won't be able to check your solution).
     * Do not make your classes public!
     *
     * Ответ: см.ниже
     *
     * */

    class Employee {

        protected String name, email;
        protected int experience;

        protected Employee(String name, String email, int experience) {
            this.name = name;
            this.email = email;
            this.experience = experience;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;

        }

        public int getExperience() {
            return experience;
        }
    }

    class Developer extends Employee {
        protected String mainLanguage;
        protected String[] skills;

        protected Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
            super(name, email, experience);
            this.mainLanguage = mainLanguage;
            this.skills = skills;
            getName();
            getEmail();
            getExperience();

        }

        public String getMainLanguage() {
            return mainLanguage;
        }

        public String[] getSkills() {
            return skills;
        }
    }

    class DataAnalyst extends Employee {

        protected boolean phd;
        protected String[] methods;

        protected DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
            super(name, email, experience);
            this.phd = phd;
            this.methods = methods;
            getName();
            getEmail();
            getExperience();
        }

        public boolean isPhD() {
            return phd;
        }

        public String[] getMethods() {
            return methods;
        }
    }
}
