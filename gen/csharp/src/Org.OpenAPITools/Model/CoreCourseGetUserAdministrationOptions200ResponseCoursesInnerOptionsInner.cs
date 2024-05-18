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
    /// CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInner
    /// </summary>
    [DataContract(Name = "core_course_get_user_administration_options_200_response_courses_inner_options_inner")]
    public partial class CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInner" /> class.
        /// </summary>
        /// <param name="available">Whether the option is available or not (default to null).</param>
        /// <param name="name">Option name (default to &quot;null&quot;).</param>
        public CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInner(bool available = null, string name = @"null")
        {
            this.Available = available;
            // use default value if no "name" provided
            this.Name = name ?? @"null";
        }

        /// <summary>
        /// Whether the option is available or not
        /// </summary>
        /// <value>Whether the option is available or not</value>
        [DataMember(Name = "available", EmitDefaultValue = true)]
        public bool Available { get; set; }

        /// <summary>
        /// Option name
        /// </summary>
        /// <value>Option name</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInner {\n");
            sb.Append("  Available: ").Append(Available).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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