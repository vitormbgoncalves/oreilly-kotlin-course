package com.github.vitormbgoncalves.introduction.interop;

import com.github.vitormbgoncalves.introduction.classes.CustomerJava;

import java.util.List;

/**
 *<p>
 *  Sample Java Interface
 *</p>
 *<p>
 * @author Vitor Goncalves
 * @since 08.04.2021, qui, 18:54
 *</p>
 */

public interface CustomerRepository {
    CustomerJava getById(int id);

    List<CustomerJava> getAll();
}