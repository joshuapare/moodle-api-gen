/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// ToolDataprivacyCreateCategoryForm200ResponseCategory
    /// </summary>
    [DataContract(Name = "tool_dataprivacy_create_category_form_200_response_category")]
    public partial class ToolDataprivacyCreateCategoryForm200ResponseCategory : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolDataprivacyCreateCategoryForm200ResponseCategory" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ToolDataprivacyCreateCategoryForm200ResponseCategory() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolDataprivacyCreateCategoryForm200ResponseCategory" /> class.
        /// </summary>
        /// <param name="description">The category description. (required) (default to &quot;&quot;).</param>
        /// <param name="descriptionformat">description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) (default to 1).</param>
        /// <param name="id">id (required) (default to 0).</param>
        /// <param name="name">The category name. (required) (default to &quot;null&quot;).</param>
        /// <param name="timecreated">timecreated (required) (default to 0).</param>
        /// <param name="timemodified">timemodified (required) (default to 0).</param>
        /// <param name="usermodified">usermodified (required) (default to 0).</param>
        public ToolDataprivacyCreateCategoryForm200ResponseCategory(string description = @"", int descriptionformat = 1, int id = 0, string name = @"null", int timecreated = 0, int timemodified = 0, int usermodified = 0)
        {
            // to ensure "description" is required (not null)
            if (description == null)
            {
                throw new ArgumentNullException("description is a required property for ToolDataprivacyCreateCategoryForm200ResponseCategory and cannot be null");
            }
            this.Description = description;
            this.Id = id;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for ToolDataprivacyCreateCategoryForm200ResponseCategory and cannot be null");
            }
            this.Name = name;
            this.Timecreated = timecreated;
            this.Timemodified = timemodified;
            this.Usermodified = usermodified;
            this.Descriptionformat = descriptionformat;
        }

        /// <summary>
        /// The category description.
        /// </summary>
        /// <value>The category description.</value>
        [DataMember(Name = "description", IsRequired = true, EmitDefaultValue = true)]
        public string Description { get; set; }

        /// <summary>
        /// description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "descriptionformat", EmitDefaultValue = false)]
        public int Descriptionformat { get; set; }

        /// <summary>
        /// id
        /// </summary>
        /// <value>id</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// The category name.
        /// </summary>
        /// <value>The category name.</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// timecreated
        /// </summary>
        /// <value>timecreated</value>
        [DataMember(Name = "timecreated", IsRequired = true, EmitDefaultValue = true)]
        public int Timecreated { get; set; }

        /// <summary>
        /// timemodified
        /// </summary>
        /// <value>timemodified</value>
        [DataMember(Name = "timemodified", IsRequired = true, EmitDefaultValue = true)]
        public int Timemodified { get; set; }

        /// <summary>
        /// usermodified
        /// </summary>
        /// <value>usermodified</value>
        [DataMember(Name = "usermodified", IsRequired = true, EmitDefaultValue = true)]
        public int Usermodified { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ToolDataprivacyCreateCategoryForm200ResponseCategory {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Descriptionformat: ").Append(Descriptionformat).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Timecreated: ").Append(Timecreated).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Usermodified: ").Append(Usermodified).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
