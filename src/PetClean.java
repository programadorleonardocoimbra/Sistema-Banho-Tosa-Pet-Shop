public class PetClean {

    private boolean clean;
    private int water;
    private int shampoo;
    private Pet pet;

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho!");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + "está limpo!");
    }

    //Adicionar água
    public void addWater() {
        if (water == 30) {
            System.out.println("A Capacidade de água da máquina está no máximo!");
            return;
        }

        water += 2;

    }

    //Adicionar Shampoo
    public void addShampoo() {
        if (shampoo == 30) {
            System.out.println("A Capacidade de água da máquina está no máximo!");
            return;
        }

        shampoo += 2;

    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    //Verificar se tem PET no banho

    public boolean hasPet() {
        return pet != null;
    }

    //Colocar o pet na máquina
    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina está suja, para colocar o pet será necessário limpa-la");
            return;
        }

        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + "está na máquina nesse momento");
            return;
        }

        this.pet = pet;
    }

    public void removePet() {
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + "está limpo!" );
        this.pet = null;
    }

    public void wash() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina está LIMPA!");
    }


}
