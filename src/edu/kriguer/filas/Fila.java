package edu.kriguer.filas;

public class Fila {

    private No refUltimoNo;

    public Fila() {
        refUltimoNo = null;
    }

    public void enqueue(No newNode) {
        newNode.setRefNo(refUltimoNo);
        refUltimoNo = newNode;
    }

    public No first() {
        if (!isEmpty()) {
            No firstNode = refUltimoNo;
            while (true) {
                if (firstNode.getRefNo() != null) {
                    firstNode = firstNode.getRefNo();
                } else break;
            }
            return firstNode;
        }
        return null;
    }

    public No dequeue() {
        if (!isEmpty()) {
            No firstNode = refUltimoNo;
            No auxNode = refUltimoNo;
            while (true) {
                if (firstNode.getRefNo() != null) {
                    auxNode = firstNode;
                    firstNode = firstNode.getRefNo();
                } else {
                    auxNode.setRefNo(null);
                    break;
                }

            }
            return firstNode;
        }
        return null;
    }

    public boolean isEmpty() {
        return refUltimoNo == null;
    }

    @Override
    public String toString() {
        String stringReturn = "";
        No auxNode = refUltimoNo;
        if (!isEmpty()) {
            while (true) {
                stringReturn += "[No{objeto=" + auxNode.getObject() + "}]---->";
                if (auxNode.getRefNo() != null) {
                    auxNode = auxNode.getRefNo();
                } else {
                    stringReturn += "null";
                    break;
                }
                ;
            }
        } else {
            stringReturn = null;

        }
        return stringReturn;
    }
}
