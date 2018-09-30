package com.heraldo.dao;

import com.heraldo.model.Medico;

public interface MedicoDAO extends CRUD<Medico> {
	void curar();
}
