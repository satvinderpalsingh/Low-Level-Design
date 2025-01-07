package atmMachineDesign;

import atmMachineDesign.state.AtmState;

public class AtmMachine {
    private AtmState atmState;
    private int totalTwoThousandNotes;
    private int totalFiveHundredNotes;
    private int totalHundredNotes;
    private int atmBalance;
    public AtmState getAtmState() {
        return atmState;
    }
    public void setAtmState(AtmState atmState) {
        this.atmState = atmState;
    }
    public int getTotalTwoThousandNotes() {
        return totalTwoThousandNotes;
    }
    public void setTotalTwoThousandNotes(int totalTwoThousandNotes) {
        this.totalTwoThousandNotes = totalTwoThousandNotes;
    }
    public int getTotalFiveHundredNotes() {
        return totalFiveHundredNotes;
    }
    public void setTotalFiveHundredNotes(int totalFiveHundredNotes) {
        this.totalFiveHundredNotes = totalFiveHundredNotes;
    }
    public int getTotalHundredNotes() {
        return totalHundredNotes;
    }
    public void setTotalHundredNotes(int totalHundredNotes) {
        this.totalHundredNotes = totalHundredNotes;
    }
    public int getAtmBalance() {
        return atmBalance;
    }
    public void setAtmBalance(int atmBalance) {
        this.atmBalance = atmBalance;
    }
    public void deductTwoThousandNotes(int count) {
        this.totalTwoThousandNotes-=count;
    }
    public void deductFiveHundredNotes(int count) {
        this.totalFiveHundredNotes-=count;
    }
    public void deductHundredNotes(int count) {
        this.totalHundredNotes-=count;
    }

}
