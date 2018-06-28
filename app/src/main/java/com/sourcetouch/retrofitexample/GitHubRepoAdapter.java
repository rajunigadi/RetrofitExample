package com.sourcetouch.retrofitexample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.sourcetouch.retrofitexample.model.GitHubRepo;

import java.util.List;

/**
 * Created by Rajashekhar Vanahalli on 27/06/18.
 */
public class GitHubRepoAdapter extends RecyclerView.Adapter<GitHubRepoAdapter.ViewHolder> {

    private List<GitHubRepo> repos;

    public GitHubRepoAdapter(List<GitHubRepo> repos) {
        this.repos = repos;
    }

    @NonNull
    @Override
    public GitHubRepoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_repo_item, parent, false);
        return new GitHubRepoAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GitHubRepoAdapter.ViewHolder holder, int position) {
        holder.tvName.setText(repos.get(position).getName());
        Glide.with(holder.ivAvatar.getContext())
                .load(repos.get(position).getAvatarUrl())
                .override(40, 40)
                .error(R.mipmap.ic_launcher)
                .placeholder(R.mipmap.ic_launcher)
                .into(holder.ivAvatar);
    }

    @Override
    public int getItemCount() {
        return repos != null && !repos.isEmpty()?repos.size():0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivAvatar;
        private TextView tvName;

        public ViewHolder(View view) {
            super(view);
            ivAvatar = (ImageView) view.findViewById(R.id.iv_avatar);
            tvName = (TextView) view.findViewById(R.id.tv_name);
        }
    }
}
