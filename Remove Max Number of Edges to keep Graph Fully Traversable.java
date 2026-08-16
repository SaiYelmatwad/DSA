class DisjointSet{
    int parent[];
    int rank[];
    int components;

    DisjointSet(int nodes){
        parent = new int[nodes + 1];
        rank = new int[nodes + 1];
        components = nodes;

        for(int i = 1; i <= nodes; i++){
            parent[i] = i;
            rank[i] = 1;
        }
    }

    public int findRootParent(int node){
        if(node == parent[node]){
            return node;
        }

        parent[node] = findRootParent(parent[node]);
        return parent[node];
    }

    public int unionByRank(int node1, int node2){
        int rootParent1 = findRootParent(node1);
        int rootParent2 = findRootParent(node2);

        if(rootParent1 == rootParent2){
            return 0;
        }

        components--;

        if(rank[rootParent1] < rank[rootParent2]){
            parent[rootParent1] = rootParent2;
            rank[rootParent2] += rank[rootParent1];
        }else{
            parent[rootParent2] = rootParent1;
            rank[rootParent1] += rank[rootParent2];
        }

        return 1;
    }
}

class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {

        DisjointSet alice = new DisjointSet(n);
        DisjointSet bob = new DisjointSet(n);

        int edgesReq = 0;

        for(int edge[] : edges){
            if(edge[0] == 3){
                edgesReq += alice.unionByRank(edge[1], edge[2]) |
                            bob.unionByRank(edge[1], edge[2]);
            }
        }

        for(int edge[] : edges){
            if(edge[0] == 1){
                edgesReq += alice.unionByRank(edge[1], edge[2]);
            }

            if(edge[0] == 2){
                edgesReq += bob.unionByRank(edge[1], edge[2]);
            }
        }

        if(alice.components == 1 && bob.components == 1){
            return edges.length - edgesReq;
        }

        return -1;
    }
}