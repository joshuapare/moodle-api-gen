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
    /// ToolPolicyGetPolicyVersionRequest
    /// </summary>
    [DataContract(Name = "tool_policy_get_policy_version_request")]
    public partial class ToolPolicyGetPolicyVersionRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolPolicyGetPolicyVersionRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ToolPolicyGetPolicyVersionRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolPolicyGetPolicyVersionRequest" /> class.
        /// </summary>
        /// <param name="behalfid">The id of user on whose behalf the user is viewing the policy (default to 0).</param>
        /// <param name="versionid">The policy version ID (required) (default to null).</param>
        public ToolPolicyGetPolicyVersionRequest(int behalfid = 0, int versionid = null)
        {
            this.Versionid = versionid;
            this.Behalfid = behalfid;
        }

        /// <summary>
        /// The id of user on whose behalf the user is viewing the policy
        /// </summary>
        /// <value>The id of user on whose behalf the user is viewing the policy</value>
        [DataMember(Name = "behalfid", EmitDefaultValue = false)]
        public int Behalfid { get; set; }

        /// <summary>
        /// The policy version ID
        /// </summary>
        /// <value>The policy version ID</value>
        [DataMember(Name = "versionid", IsRequired = true, EmitDefaultValue = true)]
        public int Versionid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ToolPolicyGetPolicyVersionRequest {\n");
            sb.Append("  Behalfid: ").Append(Behalfid).Append("\n");
            sb.Append("  Versionid: ").Append(Versionid).Append("\n");
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