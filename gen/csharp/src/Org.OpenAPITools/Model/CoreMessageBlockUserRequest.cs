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
    /// CoreMessageBlockUserRequest
    /// </summary>
    [DataContract(Name = "core_message_block_user_request")]
    public partial class CoreMessageBlockUserRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMessageBlockUserRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreMessageBlockUserRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMessageBlockUserRequest" /> class.
        /// </summary>
        /// <param name="blockeduserid">The id of the user being blocked (required) (default to null).</param>
        /// <param name="userid">The id of the user who is blocking (required) (default to null).</param>
        public CoreMessageBlockUserRequest(int blockeduserid = null, int userid = null)
        {
            this.Blockeduserid = blockeduserid;
            this.Userid = userid;
        }

        /// <summary>
        /// The id of the user being blocked
        /// </summary>
        /// <value>The id of the user being blocked</value>
        [DataMember(Name = "blockeduserid", IsRequired = true, EmitDefaultValue = true)]
        public int Blockeduserid { get; set; }

        /// <summary>
        /// The id of the user who is blocking
        /// </summary>
        /// <value>The id of the user who is blocking</value>
        [DataMember(Name = "userid", IsRequired = true, EmitDefaultValue = true)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreMessageBlockUserRequest {\n");
            sb.Append("  Blockeduserid: ").Append(Blockeduserid).Append("\n");
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
