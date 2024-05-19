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
    /// ModAssignGetParticipantRequest
    /// </summary>
    [DataContract(Name = "mod_assign_get_participant_request")]
    public partial class ModAssignGetParticipantRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignGetParticipantRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModAssignGetParticipantRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignGetParticipantRequest" /> class.
        /// </summary>
        /// <param name="assignid">assign instance id (required) (default to null).</param>
        /// <param name="embeduser">user id (default to false).</param>
        /// <param name="userid">user id (required).</param>
        public ModAssignGetParticipantRequest(int assignid = null, bool embeduser = false, int userid = default(int))
        {
            this.Assignid = assignid;
            this.Userid = userid;
            this.Embeduser = embeduser;
        }

        /// <summary>
        /// assign instance id
        /// </summary>
        /// <value>assign instance id</value>
        [DataMember(Name = "assignid", IsRequired = true, EmitDefaultValue = true)]
        public int Assignid { get; set; }

        /// <summary>
        /// user id
        /// </summary>
        /// <value>user id</value>
        [DataMember(Name = "embeduser", EmitDefaultValue = true)]
        public bool Embeduser { get; set; }

        /// <summary>
        /// user id
        /// </summary>
        /// <value>user id</value>
        [DataMember(Name = "userid", IsRequired = true, EmitDefaultValue = true)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModAssignGetParticipantRequest {\n");
            sb.Append("  Assignid: ").Append(Assignid).Append("\n");
            sb.Append("  Embeduser: ").Append(Embeduser).Append("\n");
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
