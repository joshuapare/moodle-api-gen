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
    /// CoreCourseUpdateCategoriesRequestCategoriesInner
    /// </summary>
    [DataContract(Name = "core_course_update_categories_request_categories_inner")]
    public partial class CoreCourseUpdateCategoriesRequestCategoriesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseUpdateCategoriesRequestCategoriesInner" /> class.
        /// </summary>
        /// <param name="description">category description (default to &quot;null&quot;).</param>
        /// <param name="descriptionformat">description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) (default to 1).</param>
        /// <param name="id">course id.</param>
        /// <param name="idnumber">category id number (default to &quot;null&quot;).</param>
        /// <param name="name">category name.</param>
        /// <param name="parent">parent category id (default to null).</param>
        /// <param name="theme">the category theme. This option must be enabled on moodle (default to &quot;null&quot;).</param>
        public CoreCourseUpdateCategoriesRequestCategoriesInner(string description = @"null", int descriptionformat = 1, int id = default(int), string idnumber = @"null", string name = default(string), int parent = null, string theme = @"null")
        {
            // use default value if no "description" provided
            this.Description = description ?? @"null";
            this.Descriptionformat = descriptionformat;
            this.Id = id;
            // use default value if no "idnumber" provided
            this.Idnumber = idnumber ?? @"null";
            this.Name = name;
            this.Parent = parent;
            // use default value if no "theme" provided
            this.Theme = theme ?? @"null";
        }

        /// <summary>
        /// category description
        /// </summary>
        /// <value>category description</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "descriptionformat", EmitDefaultValue = false)]
        public int Descriptionformat { get; set; }

        /// <summary>
        /// course id
        /// </summary>
        /// <value>course id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// category id number
        /// </summary>
        /// <value>category id number</value>
        [DataMember(Name = "idnumber", EmitDefaultValue = false)]
        public string Idnumber { get; set; }

        /// <summary>
        /// category name
        /// </summary>
        /// <value>category name</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// parent category id
        /// </summary>
        /// <value>parent category id</value>
        [DataMember(Name = "parent", EmitDefaultValue = false)]
        public int Parent { get; set; }

        /// <summary>
        /// the category theme. This option must be enabled on moodle
        /// </summary>
        /// <value>the category theme. This option must be enabled on moodle</value>
        [DataMember(Name = "theme", EmitDefaultValue = false)]
        public string Theme { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCourseUpdateCategoriesRequestCategoriesInner {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Descriptionformat: ").Append(Descriptionformat).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Idnumber: ").Append(Idnumber).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Parent: ").Append(Parent).Append("\n");
            sb.Append("  Theme: ").Append(Theme).Append("\n");
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
