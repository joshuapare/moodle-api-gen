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
    /// CoreCourseCheckUpdatesRequest
    /// </summary>
    [DataContract(Name = "core_course_check_updates_request")]
    public partial class CoreCourseCheckUpdatesRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseCheckUpdatesRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCourseCheckUpdatesRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseCheckUpdatesRequest" /> class.
        /// </summary>
        /// <param name="courseid">Course id to check (required) (default to null).</param>
        /// <param name="filter">filter.</param>
        /// <param name="tocheck">tocheck (required).</param>
        public CoreCourseCheckUpdatesRequest(int courseid = null, List<Object> filter = default(List<Object>), List<CoreCourseCheckUpdatesRequestTocheckInner> tocheck = default(List<CoreCourseCheckUpdatesRequestTocheckInner>))
        {
            this.Courseid = courseid;
            // to ensure "tocheck" is required (not null)
            if (tocheck == null)
            {
                throw new ArgumentNullException("tocheck is a required property for CoreCourseCheckUpdatesRequest and cannot be null");
            }
            this.Tocheck = tocheck;
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
        /// Gets or Sets Tocheck
        /// </summary>
        [DataMember(Name = "tocheck", IsRequired = true, EmitDefaultValue = true)]
        public List<CoreCourseCheckUpdatesRequestTocheckInner> Tocheck { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCourseCheckUpdatesRequest {\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Filter: ").Append(Filter).Append("\n");
            sb.Append("  Tocheck: ").Append(Tocheck).Append("\n");
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
