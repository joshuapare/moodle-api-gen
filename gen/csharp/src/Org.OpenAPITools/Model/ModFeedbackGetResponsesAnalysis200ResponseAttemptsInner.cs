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
    /// ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner
    /// </summary>
    [DataContract(Name = "mod_feedback_get_responses_analysis_200_response_attempts_inner")]
    public partial class ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner" /> class.
        /// </summary>
        /// <param name="courseid">Course id.</param>
        /// <param name="fullname">User full name.</param>
        /// <param name="id">Completed id.</param>
        /// <param name="responses">responses.</param>
        /// <param name="timemodified">Time modified for the response (default to null).</param>
        /// <param name="userid">User who responded (default to null).</param>
        public ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner(int courseid = default(int), string fullname = default(string), int id = default(int), List<ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner> responses = default(List<ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner>), int timemodified = null, int userid = null)
        {
            this.Courseid = courseid;
            this.Fullname = fullname;
            this.Id = id;
            this.Responses = responses;
            this.Timemodified = timemodified;
            this.Userid = userid;
        }

        /// <summary>
        /// Course id
        /// </summary>
        /// <value>Course id</value>
        [DataMember(Name = "courseid", EmitDefaultValue = false)]
        public int Courseid { get; set; }

        /// <summary>
        /// User full name
        /// </summary>
        /// <value>User full name</value>
        [DataMember(Name = "fullname", EmitDefaultValue = false)]
        public string Fullname { get; set; }

        /// <summary>
        /// Completed id
        /// </summary>
        /// <value>Completed id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Gets or Sets Responses
        /// </summary>
        [DataMember(Name = "responses", EmitDefaultValue = false)]
        public List<ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner> Responses { get; set; }

        /// <summary>
        /// Time modified for the response
        /// </summary>
        /// <value>Time modified for the response</value>
        [DataMember(Name = "timemodified", EmitDefaultValue = false)]
        public int Timemodified { get; set; }

        /// <summary>
        /// User who responded
        /// </summary>
        /// <value>User who responded</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner {\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Fullname: ").Append(Fullname).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Responses: ").Append(Responses).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
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
