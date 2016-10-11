package com.vtechsofts.retrofitexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by rajashekhar.v on 10/07/2016.
 */
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    final private Context mContext;
    final private List<User> mUsers;

    public UserAdapter(Context context, List<User> users) {
        this.mUsers = users;
        this.mContext = context;
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tvUser.setText(mUsers.get(position).getLogin());
        if(mUsers.get(position).getAvatar_url() != null && !mUsers.get(position).getAvatar_url().isEmpty()) {
            Glide.with(mContext).load(mUsers.get(position).getAvatar_url()).override(40, 40).error(R.mipmap.ic_launcher).placeholder(R.mipmap.ic_launcher);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int arg1) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_user_row, parent, false);
        return new ViewHolder(v);
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        final private TextView tvUser;

        public ViewHolder(View view) {
            super(view);
            tvUser = (TextView) view.findViewById(R.id.tv_user);
        }
    }
}