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
    /// ModQuizGetAttemptReviewRequest
    /// </summary>
    [DataContract(Name = "mod_quiz_get_attempt_review_request")]
    public partial class ModQuizGetAttemptReviewRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModQuizGetAttemptReviewRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModQuizGetAttemptReviewRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModQuizGetAttemptReviewRequest" /> class.
        /// </summary>
        /// <param name="attemptid">attempt id (required).</param>
        /// <param name="page">page number, empty for all the questions in all the pages (default to -1).</param>
        public ModQuizGetAttemptReviewRequest(int attemptid = default(int), int page = -1)
        {
            this.Attemptid = attemptid;
            this.Page = page;
        }

        /// <summary>
        /// attempt id
        /// </summary>
        /// <value>attempt id</value>
        [DataMember(Name = "attemptid", IsRequired = true, EmitDefaultValue = true)]
        public int Attemptid { get; set; }

        /// <summary>
        /// page number, empty for all the questions in all the pages
        /// </summary>
        /// <value>page number, empty for all the questions in all the pages</value>
        [DataMember(Name = "page", EmitDefaultValue = false)]
        public int Page { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModQuizGetAttemptReviewRequest {\n");
            sb.Append("  Attemptid: ").Append(Attemptid).Append("\n");
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
