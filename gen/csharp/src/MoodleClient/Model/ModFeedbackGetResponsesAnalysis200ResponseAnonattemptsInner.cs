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
    /// ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner
    /// </summary>
    [DataContract(Name = "mod_feedback_get_responses_analysis_200_response_anonattempts_inner")]
    public partial class ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner" /> class.
        /// </summary>
        /// <param name="courseid">Course id.</param>
        /// <param name="id">Completed id (default to null).</param>
        /// <param name="number">Response number (default to null).</param>
        /// <param name="responses">responses.</param>
        public ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner(int courseid = default(int), int id = null, int number = null, List<ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner> responses = default(List<ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner>))
        {
            this.Courseid = courseid;
            this.Id = id;
            this.Number = number;
            this.Responses = responses;
        }

        /// <summary>
        /// Course id
        /// </summary>
        /// <value>Course id</value>
        [DataMember(Name = "courseid", EmitDefaultValue = false)]
        public int Courseid { get; set; }

        /// <summary>
        /// Completed id
        /// </summary>
        /// <value>Completed id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Response number
        /// </summary>
        /// <value>Response number</value>
        [DataMember(Name = "number", EmitDefaultValue = false)]
        public int Number { get; set; }

        /// <summary>
        /// Gets or Sets Responses
        /// </summary>
        [DataMember(Name = "responses", EmitDefaultValue = false)]
        public List<ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner> Responses { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner {\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Number: ").Append(Number).Append("\n");
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
