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
    /// CoreCourseGetCoursesByFieldRequest
    /// </summary>
    [DataContract(Name = "core_course_get_courses_by_field_request")]
    public partial class CoreCourseGetCoursesByFieldRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseGetCoursesByFieldRequest" /> class.
        /// </summary>
        /// <param name="field">The field to search can be left empty for all courses or:                     id: course id                     ids: comma separated course ids                     shortname: course short name                     idnumber: course id number                     category: category id the course belongs to                  (default to &quot;&quot;).</param>
        /// <param name="value">The value to match (default to &quot;&quot;).</param>
        public CoreCourseGetCoursesByFieldRequest(string field = @"", string value = @"")
        {
            // use default value if no "field" provided
            this.Field = field ?? @"";
            // use default value if no "value" provided
            this.Value = value ?? @"";
        }

        /// <summary>
        /// The field to search can be left empty for all courses or:                     id: course id                     ids: comma separated course ids                     shortname: course short name                     idnumber: course id number                     category: category id the course belongs to                 
        /// </summary>
        /// <value>The field to search can be left empty for all courses or:                     id: course id                     ids: comma separated course ids                     shortname: course short name                     idnumber: course id number                     category: category id the course belongs to                 </value>
        [DataMember(Name = "field", EmitDefaultValue = false)]
        public string Field { get; set; }

        /// <summary>
        /// The value to match
        /// </summary>
        /// <value>The value to match</value>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCourseGetCoursesByFieldRequest {\n");
            sb.Append("  Field: ").Append(Field).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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