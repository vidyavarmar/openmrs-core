/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.api.db;

import java.util.List;
import org.openmrs.Cohort;

public interface CohortDAO {
	
	public void createCohort(Cohort cohort) throws DAOException;
	
	public Cohort getCohort(Integer id) throws DAOException;
	
	public List<Cohort> getCohorts() throws DAOException;
	
	public List<Cohort> getCohortsContainingPatientId(Integer patientId) throws DAOException;
	
	public void updateCohort(Cohort cohort) throws DAOException;

	/**
     * Auto generated method comment
     * 
     * @param guid
     * @return
     */
    public Cohort getCohortByGuid(String guid);

}
