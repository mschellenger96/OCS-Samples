/** SdsStreamView.java
 * 
 *  Copyright 2019 OSIsoft, LLC
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  
 *  http://www.apache.org/licenses/LICENSE-2.0>
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package  com.github.osisoft.ocs_sample_library_preview.sds;


public class SdsStreamView {

    private String Id = "";
    private String Name = "";
    private String Description = "";
    private String SourceTypeId = "";
    private String TargetTypeId = "";
    private SdsStreamViewProperty[] Properties = new SdsStreamViewProperty[0];

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getSourceTypeId() {
        return this.SourceTypeId;
    }

    public void setSourceTypeId(String sourceTypeId) {
        this.SourceTypeId = sourceTypeId;
    }
    
    public String getTargetTypeId() {
        return TargetTypeId;
    }

    public void setTargetTypeId(String targetTypeId) {
        this.TargetTypeId = targetTypeId;
    }

    public SdsStreamViewProperty[] getProperties() {
        return Properties;
    }

    public void setProperties(SdsStreamViewProperty[] properties) {
        this.Properties = properties;
    }
}
