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
    /// ModQuizSaveAttemptRequest
    /// </summary>
    [DataContract(Name = "mod_quiz_save_attempt_request")]
    public partial class ModQuizSaveAttemptRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModQuizSaveAttemptRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModQuizSaveAttemptRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModQuizSaveAttemptRequest" /> class.
        /// </summary>
        /// <param name="attemptid">attempt id (required).</param>
        /// <param name="data">data (required).</param>
        /// <param name="preflightdata">preflightdata.</param>
        public ModQuizSaveAttemptRequest(int attemptid = default(int), List<ModQuizGetAttemptDataRequestPreflightdataInner> data = default(List<ModQuizGetAttemptDataRequestPreflightdataInner>), List<ModQuizGetAttemptDataRequestPreflightdataInner> preflightdata = default(List<ModQuizGetAttemptDataRequestPreflightdataInner>))
        {
            this.Attemptid = attemptid;
            // to ensure "data" is required (not null)
            if (data == null)
            {
                throw new ArgumentNullException("data is a required property for ModQuizSaveAttemptRequest and cannot be null");
            }
            this.Data = data;
            this.Preflightdata = preflightdata;
        }

        /// <summary>
        /// attempt id
        /// </summary>
        /// <value>attempt id</value>
        [DataMember(Name = "attemptid", IsRequired = true, EmitDefaultValue = true)]
        public int Attemptid { get; set; }

        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [DataMember(Name = "data", IsRequired = true, EmitDefaultValue = true)]
        public List<ModQuizGetAttemptDataRequestPreflightdataInner> Data { get; set; }

        /// <summary>
        /// Gets or Sets Preflightdata
        /// </summary>
        [DataMember(Name = "preflightdata", EmitDefaultValue = false)]
        public List<ModQuizGetAttemptDataRequestPreflightdataInner> Preflightdata { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModQuizSaveAttemptRequest {\n");
            sb.Append("  Attemptid: ").Append(Attemptid).Append("\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
            sb.Append("  Preflightdata: ").Append(Preflightdata).Append("\n");
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
