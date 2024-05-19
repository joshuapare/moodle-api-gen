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
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner
    /// </summary>
    [DataContract(Name = "core_course_get_courses_by_field_200_response_courses_inner_courseformatoptions_inner")]
    public partial class CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner" /> class.
        /// </summary>
        /// <param name="name">Course format option name. (default to &quot;null&quot;).</param>
        /// <param name="value">Course format option value. (default to &quot;null&quot;).</param>
        public CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner(string name = @"null", string value = @"null")
        {
            // use default value if no "name" provided
            this.Name = name ?? @"null";
            // use default value if no "value" provided
            this.Value = value ?? @"null";
        }

        /// <summary>
        /// Course format option name.
        /// </summary>
        /// <value>Course format option name.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Course format option value.
        /// </summary>
        /// <value>Course format option value.</value>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
