package com.example.praktikum9;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u001b\u0010\u0015\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000\u00a2\u0006\u0002\b\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/praktikum9/WordListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/praktikum9/WordListAdapter$WordViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "inflater", "Landroid/view/LayoutInflater;", "words", "", "Lcom/example/praktikum9/Word;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setWords", "setWords$app_debug", "WordViewHolder", "app_debug"})
public final class WordListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.praktikum9.WordListAdapter.WordViewHolder> {
    private final android.view.LayoutInflater inflater = null;
    private java.util.List<com.example.praktikum9.Word> words;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.praktikum9.WordListAdapter.WordViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.praktikum9.WordListAdapter.WordViewHolder holder, int position) {
    }
    
    public final void setWords$app_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.praktikum9.Word> words) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public WordListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/praktikum9/WordListAdapter$WordViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/praktikum9/WordListAdapter;Landroid/view/View;)V", "wordItemView", "Landroid/widget/TextView;", "getWordItemView", "()Landroid/widget/TextView;", "app_debug"})
    public final class WordViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView wordItemView = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getWordItemView() {
            return null;
        }
        
        public WordViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}