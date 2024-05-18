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
    /// ModQuizGetUserAttemptsRequest
    /// </summary>
    [DataContract(Name = "mod_quiz_get_user_attempts_request")]
    public partial class ModQuizGetUserAttemptsRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModQuizGetUserAttemptsRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModQuizGetUserAttemptsRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModQuizGetUserAttemptsRequest" /> class.
        /// </summary>
        /// <param name="includepreviews">whether to include previews or not (default to false).</param>
        /// <param name="quizid">quiz instance id (required).</param>
        /// <param name="status">quiz status: all, finished or unfinished (default to &quot;finished&quot;).</param>
        /// <param name="userid">user id, empty for current user (default to 0).</param>
        public ModQuizGetUserAttemptsRequest(bool includepreviews = false, int quizid = default(int), string status = @"finished", int userid = 0)
        {
            this.Quizid = quizid;
            this.Includepreviews = includepreviews;
            // use default value if no "status" provided
            this.Status = status ?? @"finished";
            this.Userid = userid;
        }

        /// <summary>
        /// whether to include previews or not
        /// </summary>
        /// <value>whether to include previews or not</value>
        [DataMember(Name = "includepreviews", EmitDefaultValue = true)]
        public bool Includepreviews { get; set; }

        /// <summary>
        /// quiz instance id
        /// </summary>
        /// <value>quiz instance id</value>
        [DataMember(Name = "quizid", IsRequired = true, EmitDefaultValue = true)]
        public int Quizid { get; set; }

        /// <summary>
        /// quiz status: all, finished or unfinished
        /// </summary>
        /// <value>quiz status: all, finished or unfinished</value>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public string Status { get; set; }

        /// <summary>
        /// user id, empty for current user
        /// </summary>
        /// <value>user id, empty for current user</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModQuizGetUserAttemptsRequest {\n");
            sb.Append("  Includepreviews: ").Append(Includepreviews).Append("\n");
            sb.Append("  Quizid: ").Append(Quizid).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
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