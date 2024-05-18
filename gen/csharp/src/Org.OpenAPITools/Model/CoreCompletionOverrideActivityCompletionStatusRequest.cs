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
    /// CoreCompletionOverrideActivityCompletionStatusRequest
    /// </summary>
    [DataContract(Name = "core_completion_override_activity_completion_status_request")]
    public partial class CoreCompletionOverrideActivityCompletionStatusRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompletionOverrideActivityCompletionStatusRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCompletionOverrideActivityCompletionStatusRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompletionOverrideActivityCompletionStatusRequest" /> class.
        /// </summary>
        /// <param name="cmid">course module id (required) (default to null).</param>
        /// <param name="newstate">the new activity completion state (required) (default to null).</param>
        /// <param name="userid">user id (required).</param>
        public CoreCompletionOverrideActivityCompletionStatusRequest(int cmid = null, int newstate = null, int userid = default(int))
        {
            this.Cmid = cmid;
            this.Newstate = newstate;
            this.Userid = userid;
        }

        /// <summary>
        /// course module id
        /// </summary>
        /// <value>course module id</value>
        [DataMember(Name = "cmid", IsRequired = true, EmitDefaultValue = true)]
        public int Cmid { get; set; }

        /// <summary>
        /// the new activity completion state
        /// </summary>
        /// <value>the new activity completion state</value>
        [DataMember(Name = "newstate", IsRequired = true, EmitDefaultValue = true)]
        public int Newstate { get; set; }

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
            sb.Append("class CoreCompletionOverrideActivityCompletionStatusRequest {\n");
            sb.Append("  Cmid: ").Append(Cmid).Append("\n");
            sb.Append("  Newstate: ").Append(Newstate).Append("\n");
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