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
    /// ModScormGetScormAttemptCountRequest
    /// </summary>
    [DataContract(Name = "mod_scorm_get_scorm_attempt_count_request")]
    public partial class ModScormGetScormAttemptCountRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModScormGetScormAttemptCountRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModScormGetScormAttemptCountRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModScormGetScormAttemptCountRequest" /> class.
        /// </summary>
        /// <param name="ignoremissingcompletion">Ignores attempts that haven&#39;t reported a grade/completion (default to false).</param>
        /// <param name="scormid">SCORM instance id (required) (default to null).</param>
        /// <param name="userid">User id (required).</param>
        public ModScormGetScormAttemptCountRequest(bool ignoremissingcompletion = false, int scormid = null, int userid = default(int))
        {
            this.Scormid = scormid;
            this.Userid = userid;
            this.Ignoremissingcompletion = ignoremissingcompletion;
        }

        /// <summary>
        /// Ignores attempts that haven&#39;t reported a grade/completion
        /// </summary>
        /// <value>Ignores attempts that haven&#39;t reported a grade/completion</value>
        [DataMember(Name = "ignoremissingcompletion", EmitDefaultValue = true)]
        public bool Ignoremissingcompletion { get; set; }

        /// <summary>
        /// SCORM instance id
        /// </summary>
        /// <value>SCORM instance id</value>
        [DataMember(Name = "scormid", IsRequired = true, EmitDefaultValue = true)]
        public int Scormid { get; set; }

        /// <summary>
        /// User id
        /// </summary>
        /// <value>User id</value>
        [DataMember(Name = "userid", IsRequired = true, EmitDefaultValue = true)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModScormGetScormAttemptCountRequest {\n");
            sb.Append("  Ignoremissingcompletion: ").Append(Ignoremissingcompletion).Append("\n");
            sb.Append("  Scormid: ").Append(Scormid).Append("\n");
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
