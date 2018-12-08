package com.summer.mye3.cart.service;

import com.summer.common.utils.E3Result;
import com.summer.pojo.TbItem;

import java.util.List;

public interface CartService {
    E3Result addCart(long userId, long itemId, int num);

    E3Result mergeCart(long userId, List<TbItem> itemList);

    List<TbItem> getCartList(long userId);

    E3Result updateCartNum(long userId, long itemId, int num);

    E3Result deleteCartItem(long userId, long itemId);
}
