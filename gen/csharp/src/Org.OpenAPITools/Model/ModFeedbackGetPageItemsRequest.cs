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
    /// ModFeedbackGetPageItemsRequest
    /// </summary>
    [DataContract(Name = "mod_feedback_get_page_items_request")]
    public partial class ModFeedbackGetPageItemsRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModFeedbackGetPageItemsRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModFeedbackGetPageItemsRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModFeedbackGetPageItemsRequest" /> class.
        /// </summary>
        /// <param name="courseid">Course where user completes the feedback (for site feedbacks only). (default to 0).</param>
        /// <param name="feedbackid">Feedback instance id (required).</param>
        /// <param name="page">The page to get starting by 0 (required) (default to null).</param>
        public ModFeedbackGetPageItemsRequest(int courseid = 0, int feedbackid = default(int), int page = null)
        {
            this.Feedbackid = feedbackid;
            this.Page = page;
            this.Courseid = courseid;
        }

        /// <summary>
        /// Course where user completes the feedback (for site feedbacks only).
        /// </summary>
        /// <value>Course where user completes the feedback (for site feedbacks only).</value>
        [DataMember(Name = "courseid", EmitDefaultValue = false)]
        public int Courseid { get; set; }

        /// <summary>
        /// Feedback instance id
        /// </summary>
        /// <value>Feedback instance id</value>
        [DataMember(Name = "feedbackid", IsRequired = true, EmitDefaultValue = true)]
        public int Feedbackid { get; set; }

        /// <summary>
        /// The page to get starting by 0
        /// </summary>
        /// <value>The page to get starting by 0</value>
        [DataMember(Name = "page", IsRequired = true, EmitDefaultValue = true)]
        public int Page { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModFeedbackGetPageItemsRequest {\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Feedbackid: ").Append(Feedbackid).Append("\n");
            sb.Append("  Page: ").Append(Page).Append("\n");
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
