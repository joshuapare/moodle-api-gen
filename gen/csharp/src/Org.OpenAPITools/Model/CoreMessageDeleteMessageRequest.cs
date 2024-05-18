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
    /// CoreMessageDeleteMessageRequest
    /// </summary>
    [DataContract(Name = "core_message_delete_message_request")]
    public partial class CoreMessageDeleteMessageRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMessageDeleteMessageRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreMessageDeleteMessageRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMessageDeleteMessageRequest" /> class.
        /// </summary>
        /// <param name="messageid">The message id (required) (default to null).</param>
        /// <param name="read">If is a message read (default to true).</param>
        /// <param name="userid">The user id of who we want to delete the message for (required) (default to null).</param>
        public CoreMessageDeleteMessageRequest(int messageid = null, bool read = true, int userid = null)
        {
            this.Messageid = messageid;
            this.Userid = userid;
            this.Read = read;
        }

        /// <summary>
        /// The message id
        /// </summary>
        /// <value>The message id</value>
        [DataMember(Name = "messageid", IsRequired = true, EmitDefaultValue = true)]
        public int Messageid { get; set; }

        /// <summary>
        /// If is a message read
        /// </summary>
        /// <value>If is a message read</value>
        [DataMember(Name = "read", EmitDefaultValue = true)]
        public bool Read { get; set; }

        /// <summary>
        /// The user id of who we want to delete the message for
        /// </summary>
        /// <value>The user id of who we want to delete the message for</value>
        [DataMember(Name = "userid", IsRequired = true, EmitDefaultValue = true)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreMessageDeleteMessageRequest {\n");
            sb.Append("  Messageid: ").Append(Messageid).Append("\n");
            sb.Append("  Read: ").Append(Read).Append("\n");
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