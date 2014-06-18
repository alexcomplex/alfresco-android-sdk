/*******************************************************************************
 * Copyright (C) 2005-2014 Alfresco Software Limited.
 * 
 * This file is part of the Alfresco Mobile SDK.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 ******************************************************************************/
package org.alfresco.mobile.android.api.model.config;

import java.util.List;

public interface FormConfig extends ItemConfig
{
    /** Returns the unique identifier of the form. */
    public String getIdentifier();

    /** Returns the label of the form. */
    public String getLabel();

    /**
     * Returns the layout the client application should use to render the form.
     */
    public String getLayout();

    /** Returns the groups for the form. */
    public List<FormFieldsGroupConfig> getGroups();

}
