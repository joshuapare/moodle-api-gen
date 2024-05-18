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
    /// CoreMessageUnmuteConversationsRequest
    /// </summary>
    [DataContract(Name = "core_message_unmute_conversations_request")]
    public partial class CoreMessageUnmuteConversationsRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMessageUnmuteConversationsRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreMessageUnmuteConversationsRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMessageUnmuteConversationsRequest" /> class.
        /// </summary>
        /// <param name="conversationids">conversationids (required).</param>
        /// <param name="userid">The id of the user who is unblocking (required).</param>
        public CoreMessageUnmuteConversationsRequest(List<Object> conversationids = default(List<Object>), int userid = default(int))
        {
            // to ensure "conversationids" is required (not null)
            if (conversationids == null)
            {
                throw new ArgumentNullException("conversationids is a required property for CoreMessageUnmuteConversationsRequest and cannot be null");
            }
            this.Conversationids = conversationids;
            this.Userid = userid;
        }

        /// <summary>
        /// Gets or Sets Conversationids
        /// </summary>
        [DataMember(Name = "conversationids", IsRequired = true, EmitDefaultValue = true)]
        public List<Object> Conversationids { get; set; }

        /// <summary>
        /// The id of the user who is unblocking
        /// </summary>
        /// <value>The id of the user who is unblocking</value>
        [DataMember(Name = "userid", IsRequired = true, EmitDefaultValue = true)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreMessageUnmuteConversationsRequest {\n");
            sb.Append("  Conversationids: ").Append(Conversationids).Append("\n");
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