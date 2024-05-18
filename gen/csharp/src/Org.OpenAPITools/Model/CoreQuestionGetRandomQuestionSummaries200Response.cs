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
    /// CoreQuestionGetRandomQuestionSummaries200Response
    /// </summary>
    [DataContract(Name = "core_question_get_random_question_summaries_200_response")]
    public partial class CoreQuestionGetRandomQuestionSummaries200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreQuestionGetRandomQuestionSummaries200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreQuestionGetRandomQuestionSummaries200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreQuestionGetRandomQuestionSummaries200Response" /> class.
        /// </summary>
        /// <param name="questions">questions (required).</param>
        /// <param name="totalcount">total number of questions in result set (required) (default to null).</param>
        public CoreQuestionGetRandomQuestionSummaries200Response(List<CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner> questions = default(List<CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner>), int totalcount = null)
        {
            // to ensure "questions" is required (not null)
            if (questions == null)
            {
                throw new ArgumentNullException("questions is a required property for CoreQuestionGetRandomQuestionSummaries200Response and cannot be null");
            }
            this.Questions = questions;
            this.Totalcount = totalcount;
        }

        /// <summary>
        /// Gets or Sets Questions
        /// </summary>
        [DataMember(Name = "questions", IsRequired = true, EmitDefaultValue = true)]
        public List<CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner> Questions { get; set; }

        /// <summary>
        /// total number of questions in result set
        /// </summary>
        /// <value>total number of questions in result set</value>
        [DataMember(Name = "totalcount", IsRequired = true, EmitDefaultValue = true)]
        public int Totalcount { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreQuestionGetRandomQuestionSummaries200Response {\n");
            sb.Append("  Questions: ").Append(Questions).Append("\n");
            sb.Append("  Totalcount: ").Append(Totalcount).Append("\n");
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