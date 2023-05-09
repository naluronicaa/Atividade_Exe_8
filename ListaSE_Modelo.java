public class ListaSE_Modelo {
    public class NodeSE{
        private int iElement;
        private NodeSE nsNext;

        public NodeSE(){
            iElement = 0;
            nsNext = null;
        }
        
        public NodeSE (int iE, NodeSE nsN){
            iElement = iE;
            nsNext = nsN;
        }
        
        void setNext(NodeSE nsN){
            nsNext = nsN;
        }
        
        int getElement(){
            return iElement;
        }

        NodeSE getNext(){
            return nsNext;
        }

        private NodeSE nsInicio;
        private NodeSE nsFim;
        private int iTamanho;

        public ListaSE_Modelo(){
            nsInicio = null;
            nsFim = null;
            iTamanho = 0;
        }

        public void putHead(int iT){
            NodeSE nsNovo = new NodeSE(iT, null);
            if(isEmpty())
                nsFim = nsNovo;
            else
                nsNovo.setNext(nsInicio);
            nsInicio = nsNovo;
            iTamanho++;
        }

        public void putTail(int iT){
            NodeSE nsNovo = new NodeSE(iT, null);
            if(isEmpty())
                nsInicio = nsNovo;
            else
                nsFim.setNext(nsNovo);
            nsFim = nsNovo;
            iTamanho++;
        }

        public int takeHead(){
            int iT = -1; //is Empty
            if(!isEmpty()){ //is not Empty
                iT= nsInicio.getElement();
                if(size() == 1){
                    nsInicio = null;
                    nsFim = null;
                }
                else
                    nsInicio = nsInicio.getNext();
                iTamanho--;
            }
            return iT;
        }

        public int takeTail(){
            int iT = -1; //is Empty
            if(!isEmpty()){//is not Empty
                iT = nsFim.getElement();
                if(size() == 1){
                    nsInicio = null;
                    nsFim = null;
                }
                else{
                    NodeSE nsAux = new NodeSE();
                    nsAux = nsInicio;
                    while(nsAux.getNext() != nsFim)
                        nsAux = nsAux.getNext();
                    nsFim = nsAux;
                    nsAux.setNext(null);
                }
                iTamanho--;
            }
            return iT;
        }

        public int viewHead(){
            int iT = -1; //is Empty
            if(!isEmpty())
                iT = nsInicio.getElement(); //is not Empty
            return iT;
        }

        public int viewTail(){
            int iT = -1; //is Empty
            if(!isEmpty())
                iT = nsFim.getElement(); //is not Empty
            return iT;
        }

        public int size(){
            return iTamanho;
        }

        public boolean isEmpty(){
            boolean bR = false;
            if(size() == 0)
                bR = true;
            return bR;
        }

    }
}
