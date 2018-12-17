package com.dmspallas;

import java.util.List;
import java.util.Stack;


public class Dfs {
    private Stack<Vertex>stack;

    public Dfs(){
        this.stack = new Stack<>();
    }
    public void dfs(List<Vertex> vertexList){
        for(Vertex v: vertexList){
            if(!v.isVisited()){
                v.setVisited(true);
                dfsWithStack(v);
            }
        }
    }
    private void dfsWithStack(Vertex rootVertex){
        this.stack.add(rootVertex);
        rootVertex.setVisited(true);

        while(!stack.empty()){
            Vertex actualVertex = this.stack.pop();
            System.out.println(actualVertex +" ");

            for(Vertex v: actualVertex.getNeighbourList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    this.stack.push(v);
                }
            }
        }
    }
}
