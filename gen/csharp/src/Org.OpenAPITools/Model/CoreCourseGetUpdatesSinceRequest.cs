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
    /// CoreCourseGetUpdatesSinceRequest
    /// </summary>
    [DataContract(Name = "core_course_get_updates_since_request")]
    public partial class CoreCourseGetUpdatesSinceRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseGetUpdatesSinceRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCourseGetUpdatesSinceRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseGetUpdatesSinceRequest" /> class.
        /// </summary>
        /// <param name="courseid">Course id to check (required).</param>
        /// <param name="filter">filter.</param>
        /// <param name="since">Check updates since this time stamp (required).</param>
        public CoreCourseGetUpdatesSinceRequest(int courseid = default(int), List<Object> filter = default(List<Object>), int since = default(int))
        {
            this.Courseid = courseid;
            this.Since = since;
            this.Filter = filter;
        }

        /// <summary>
        /// Course id to check
        /// </summary>
        /// <value>Course id to check</value>
        [DataMember(Name = "courseid", IsRequired = true, EmitDefaultValue = true)]
        public int Courseid { get; set; }

        /// <summary>
        /// Gets or Sets Filter
        /// </summary>
        [DataMember(Name = "filter", EmitDefaultValue = false)]
        public List<Object> Filter { get; set; }

        /// <summary>
        /// Check updates since this time stamp
        /// </summary>
        /// <value>Check updates since this time stamp</value>
        [DataMember(Name = "since", IsRequired = true, EmitDefaultValue = true)]
        public int Since { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCourseGetUpdatesSinceRequest {\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Filter: ").Append(Filter).Append("\n");
            sb.Append("  Since: ").Append(Since).Append("\n");
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