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
    /// CoreCourseGetUserAdministrationOptions200ResponseCoursesInner
    /// </summary>
    [DataContract(Name = "core_course_get_user_administration_options_200_response_courses_inner")]
    public partial class CoreCourseGetUserAdministrationOptions200ResponseCoursesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseGetUserAdministrationOptions200ResponseCoursesInner" /> class.
        /// </summary>
        /// <param name="id">Course id.</param>
        /// <param name="options">options.</param>
        public CoreCourseGetUserAdministrationOptions200ResponseCoursesInner(int id = default(int), List<CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInner> options = default(List<CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInner>))
        {
            this.Id = id;
            this.Options = options;
        }

        /// <summary>
        /// Course id
        /// </summary>
        /// <value>Course id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Gets or Sets Options
        /// </summary>
        [DataMember(Name = "options", EmitDefaultValue = false)]
        public List<CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInner> Options { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCourseGetUserAdministrationOptions200ResponseCoursesInner {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Options: ").Append(Options).Append("\n");
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