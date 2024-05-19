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
    /// ModFeedbackProcessPageRequest
    /// </summary>
    [DataContract(Name = "mod_feedback_process_page_request")]
    public partial class ModFeedbackProcessPageRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModFeedbackProcessPageRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModFeedbackProcessPageRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModFeedbackProcessPageRequest" /> class.
        /// </summary>
        /// <param name="courseid">Course where user completes the feedback (for site feedbacks only). (default to 0).</param>
        /// <param name="feedbackid">Feedback instance id. (required).</param>
        /// <param name="goprevious">Whether we want to jump to previous page. (default to false).</param>
        /// <param name="page">The page being processed. (required) (default to null).</param>
        /// <param name="responses">responses.</param>
        public ModFeedbackProcessPageRequest(int courseid = 0, int feedbackid = default(int), bool goprevious = false, int page = null, List<ModFeedbackProcessPageRequestResponsesInner> responses = default(List<ModFeedbackProcessPageRequestResponsesInner>))
        {
            this.Feedbackid = feedbackid;
            this.Page = page;
            this.Courseid = courseid;
            this.Goprevious = goprevious;
            this.Responses = responses;
        }

        /// <summary>
        /// Course where user completes the feedback (for site feedbacks only).
        /// </summary>
        /// <value>Course where user completes the feedback (for site feedbacks only).</value>
        [DataMember(Name = "courseid", EmitDefaultValue = false)]
        public int Courseid { get; set; }

        /// <summary>
        /// Feedback instance id.
        /// </summary>
        /// <value>Feedback instance id.</value>
        [DataMember(Name = "feedbackid", IsRequired = true, EmitDefaultValue = true)]
        public int Feedbackid { get; set; }

        /// <summary>
        /// Whether we want to jump to previous page.
        /// </summary>
        /// <value>Whether we want to jump to previous page.</value>
        [DataMember(Name = "goprevious", EmitDefaultValue = true)]
        public bool Goprevious { get; set; }

        /// <summary>
        /// The page being processed.
        /// </summary>
        /// <value>The page being processed.</value>
        [DataMember(Name = "page", IsRequired = true, EmitDefaultValue = true)]
        public int Page { get; set; }

        /// <summary>
        /// Gets or Sets Responses
        /// </summary>
        [DataMember(Name = "responses", EmitDefaultValue = false)]
        public List<ModFeedbackProcessPageRequestResponsesInner> Responses { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModFeedbackProcessPageRequest {\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Feedbackid: ").Append(Feedbackid).Append("\n");
            sb.Append("  Goprevious: ").Append(Goprevious).Append("\n");
            sb.Append("  Page: ").Append(Page).Append("\n");
            sb.Append("  Responses: ").Append(Responses).Append("\n");
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
