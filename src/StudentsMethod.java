public class StudentsMethod {
    public void info(Hogwarts name) {
        System.out.println(name.toString());
    }

    public void studentComprassionInFaculties(Gryffindor name, Gryffindor secondName) {
        int counter = name.getPowerOfMagic() + name.getTransgression() + name.getBravery() + name.getHonour() + name.getNobility();
        int secondCounter = secondName.getPowerOfMagic() + secondName.getTransgression() + secondName.getBravery() + secondName.getHonour() + secondName.getNobility();
        if (counter > secondCounter) {
            System.out.println(name.getName() + " stronger than " + secondName.getName());
        } else if (counter < secondCounter) {
            System.out.println(secondName.getName() + " stronger than " + name.getName());
        } else {
            System.out.println(name.getName() + " and " + secondName.getName() + " have equal power ");
        }
    }
    public void studentComprassionInFaculties(Hufflepuff name, Hufflepuff secondName) {
        int counter = name.getPowerOfMagic() +
                name.getTransgression() +
                name.getLoyalty() +
                name.getIndustriousness() +
                name.getHonesty();
        int secondCounter = secondName.getPowerOfMagic() +
                secondName.getTransgression() +
                secondName.getLoyalty() +
                secondName.getIndustriousness() +
                secondName.getHonesty();
        if (counter > secondCounter) {
            System.out.println(name.getName() + " stronger than " + secondName.getName());
        } else if (counter < secondCounter) {
            System.out.println(secondName.getName() + " stronger than " + name.getName());
        } else {
            System.out.println(name.getName() + " and " + secondName.getName() + " have equal power ");
        }
    }
    public void studentComprassionInFaculties(Ravenclaw name, Ravenclaw secondName) {
        int counter = name.getPowerOfMagic() +
                name.getTransgression() +
                name.getFullnessOfCreativity() +
                name.getWisdom() +
                name.getWit() +
                name.getSmart();
        int secondCounter = secondName.getPowerOfMagic() +
                secondName.getTransgression() +
                secondName.getFullnessOfCreativity() +
                secondName.getWisdom() +
                secondName.getWit() +
                secondName.getSmart();
        if (counter > secondCounter) {
            System.out.println(name.getName() + " stronger than " + secondName.getName());
        } else if (counter < secondCounter) {
            System.out.println(secondName.getName() + " stronger than " + name.getName());
        } else {
            System.out.println(name.getName() + " and " + secondName.getName() + " have equal power ");
        }
    }
    public void studentComprassionInFaculties(Slytherin name, Slytherin secondName) {
        int counter = name.getPowerOfMagic() +
                name.getTransgression() +
                name.getLustOfPower() +
                name.getResourcefulness() +
                name.getAmbition() +
                name.getCunning() +
                name.getDetermination();
        int secondCounter = secondName.getPowerOfMagic() +
                secondName.getTransgression() +
                secondName.getLustOfPower() +
                secondName.getResourcefulness() +
                secondName.getAmbition() +
                secondName.getCunning() +
                secondName.getDetermination();
        if (counter > secondCounter) {
            System.out.println(name.getName() + " stronger than " + secondName.getName());
        } else if (counter < secondCounter) {
            System.out.println(secondName.getName() + " stronger than " + name.getName());
        } else {
            System.out.println(name.getName() + " and " + secondName.getName() + " have equal power ");
        }
    }


    public void studentComprassion(Hogwarts name, Hogwarts secondName) {
        int counter = name.getPowerOfMagic() +
                name.getTransgression();
        int secondCounter = secondName.getPowerOfMagic() +
                secondName.getTransgression();
        if (counter > secondCounter) {
            System.out.println(name.getName() + " stronger than " + secondName.getName());
        } else if (counter < secondCounter) {
            System.out.println(secondName.getName() + " stronger than " + name.getName());
        } else {
            System.out.println(name.getName() + " and " + secondName.getName() + " have equal power ");
        }
    }


}
