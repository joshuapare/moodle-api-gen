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
    /// CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus
    /// </summary>
    [DataContract(Name = "core_completion_get_course_completion_status_200_response_completionstatus")]
    public partial class CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus" /> class.
        /// </summary>
        /// <param name="aggregation">aggregation method 1 means all, 2 means any (required) (default to null).</param>
        /// <param name="completed">true if the course is complete, false otherwise (required) (default to null).</param>
        /// <param name="completions">completions (required).</param>
        public CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus(int aggregation = null, bool completed = null, List<CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner> completions = default(List<CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner>))
        {
            this.Aggregation = aggregation;
            this.Completed = completed;
            // to ensure "completions" is required (not null)
            if (completions == null)
            {
                throw new ArgumentNullException("completions is a required property for CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus and cannot be null");
            }
            this.Completions = completions;
        }

        /// <summary>
        /// aggregation method 1 means all, 2 means any
        /// </summary>
        /// <value>aggregation method 1 means all, 2 means any</value>
        [DataMember(Name = "aggregation", IsRequired = true, EmitDefaultValue = true)]
        public int Aggregation { get; set; }

        /// <summary>
        /// true if the course is complete, false otherwise
        /// </summary>
        /// <value>true if the course is complete, false otherwise</value>
        [DataMember(Name = "completed", IsRequired = true, EmitDefaultValue = true)]
        public bool Completed { get; set; }

        /// <summary>
        /// Gets or Sets Completions
        /// </summary>
        [DataMember(Name = "completions", IsRequired = true, EmitDefaultValue = true)]
        public List<CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner> Completions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus {\n");
            sb.Append("  Aggregation: ").Append(Aggregation).Append("\n");
            sb.Append("  Completed: ").Append(Completed).Append("\n");
            sb.Append("  Completions: ").Append(Completions).Append("\n");
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