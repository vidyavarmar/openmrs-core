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

import java.util.Collection;
import java.util.List;

import org.openmrs.Concept;
import org.openmrs.Field;
import org.openmrs.FieldAnswer;
import org.openmrs.FieldType;
import org.openmrs.Form;
import org.openmrs.FormField;
import org.openmrs.api.APIException;

/**
 * Form-related database functions
 * 
 */
public interface FormDAO {
	
	/**
	 * Create a new form
	 * @param form
	 * @returns the new Form object
	 * @throws DAOException
	 */
	public Form createForm(Form form) throws DAOException;

	/**
	 * Creates new form from the given <code>form</code>
	 * 
	 * @param form Form to duplicate
	 * @return newly duplicated Form
	 * @throws DAOException
	 */
	public Form duplicateForm(Form form) throws DAOException;
	
	/**
	 * Get form by internal form identifier
	 * @param formId internal identifier
	 * @return requested form
	 * @throws DAOException
	 */
	public Form getForm(Integer formId) throws DAOException;
	
	/**
	 * @see org.openmrs.api.FormService#getForms(boolean,boolean)
	 */
	public List<Form> getForms(boolean publishedOnly, boolean includeRetired) throws DAOException;
	
	/**
	 * Save changes to form
	 * @param form
	 * @throws DAOException
	 */
	public void updateForm(Form form) throws DAOException;
	
	/**
	 * Delete form from database. This is included for troubleshooting and
	 * low-level system administration. Ideally, this method should <b>never</b>
	 * be called &mdash; <code>Forms</code> should be <em>retired</em> and
	 * not <em>deleted</em> altogether (since many foreign key constraints
	 * depend on forms, deleting a form would require deleting all traces, and
	 * any historical trail would be lost).
	 * 
	 * This method only clears form roles and attempts to delete the form
	 * record. If the form has been included in any other parts of the database
	 * (through a foreign key), the attempt to delete the form will violate
	 * foreign key constraints and fail.
	 * 
	 * @param form
	 * @throws DAOException
	 */
	public void deleteForm(Form form) throws DAOException;
	
	/**
	 * Get all field types
	 * 
	 * @return field types list
	 * @throws DAOException
	 */
	public List<FieldType> getFieldTypes() throws DAOException;

	/**
	 * Get fieldType by internal identifier
	 * 
	 * @param fieldType id
	 * @return fieldType with given internal identifier
	 * @throws DAOException
	 */
	public FieldType getFieldType(Integer fieldTypeId) throws DAOException;
	
	/**
	 * 
	 * @return list of forms in the db
	 * @throws DAOException
	 */
	public List<Form> getForms() throws DAOException;

	/**
	 * 
	 * @param Concept to search for in the forms
	 * @return List of forms relating to this concept
	 * @throws DAOException
	 */
	public List<Form> getForms(Concept c) throws DAOException;
	
	/**
	 * @return list of form fields for a specific form
	 * @throws DAOException
	 */
	public List<FormField> getFormFields(Form form) throws DAOException;

	/**
	 * @see org.openmrs.api.FormService#getFormField(org.openmrs.Form, org.openmrs.Concept, java.util.Collection, boolean)
	 */
	public FormField getFormField(Form form, Concept concept, Collection<FormField> ignoreFormFields, boolean force) throws APIException;
	
	/**
	 * 
	 * @return list of fields in the db matching search phrase
	 * @throws DAOException
	 */
	public List<Field> findFields(String search) throws DAOException;

	/**
	 * 
	 * @return list of fields in the db with given concept
	 * @throws DAOException
	 */	
	public List<Field> findFields(Concept concept) throws DAOException;
	
	/**
	 * 
	 * @return list of fields in the db
	 * @throws DAOException
	 */
	public List<Field> getFields() throws DAOException;
		
	/**
	 * 
	 * @param fieldId
	 * @return
	 * @throws DAOException
	 */
	public Field getField(Integer fieldId) throws DAOException;
	
	/**
	 * 
	 * @param field
	 * @throws DAOException
	 */
	public void createField(Field field) throws DAOException;

	/**
	 * 
	 * @param field
	 * @throws DAOException
	 */
	public void updateField(Field field) throws DAOException;
	
	/**
	 * 
	 * @param field
	 * @throws DAOException
	 */
	public void deleteField(Field field) throws DAOException;
	
	/**
	 * 
	 * @param formFieldId
	 * @return
	 * @throws DAOException
	 */
	public FormField getFormField(Integer formFieldId) throws DAOException;
	
	/**
	 * 
	 * @param formField
	 * @throws DAOException
	 */
	public void createFormField(FormField formField) throws DAOException;

	/**
	 * 
	 * @param formField
	 * @throws DAOException
	 */
	public void updateFormField(FormField formField) throws DAOException;
	
	/**
	 * 
	 * @param formField
	 * @throws DAOException
	 */
	public void deleteFormField(FormField formField) throws DAOException;

	/**
     * Auto generated method comment
     * 
     * @param guid
     * @return
     */
    public Field getFieldByGuid(String guid);

    public FieldAnswer getFieldAnswerByGuid(String guid);

	/**
     * Auto generated method comment
     * 
     * @param guid
     * @return
     */
    public FieldType getFieldTypeByGuid(String guid);

	/**
     * Auto generated method comment
     * 
     * @param guid
     * @return
     */
    public Form getFormByGuid(String guid);

	/**
     * Auto generated method comment
     * 
     * @param guid
     * @return
     */
    public FormField getFormFieldByGuid(String guid);

	/**
     * @see org.openmrs.api.FormService#findForms(java.lang.String, boolean, boolean)
     */
    public List<Form> findForms(String text, boolean includeUnpublished, boolean includeRetired);
	
}
