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
    /// CoreAuthConfirmUserRequest
    /// </summary>
    [DataContract(Name = "core_auth_confirm_user_request")]
    public partial class CoreAuthConfirmUserRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreAuthConfirmUserRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreAuthConfirmUserRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreAuthConfirmUserRequest" /> class.
        /// </summary>
        /// <param name="secret">Confirmation secret (required) (default to &quot;null&quot;).</param>
        /// <param name="username">User name (required) (default to &quot;null&quot;).</param>
        public CoreAuthConfirmUserRequest(string secret = @"null", string username = @"null")
        {
            // to ensure "secret" is required (not null)
            if (secret == null)
            {
                throw new ArgumentNullException("secret is a required property for CoreAuthConfirmUserRequest and cannot be null");
            }
            this.Secret = secret;
            // to ensure "username" is required (not null)
            if (username == null)
            {
                throw new ArgumentNullException("username is a required property for CoreAuthConfirmUserRequest and cannot be null");
            }
            this.Username = username;
        }

        /// <summary>
        /// Confirmation secret
        /// </summary>
        /// <value>Confirmation secret</value>
        [DataMember(Name = "secret", IsRequired = true, EmitDefaultValue = true)]
        public string Secret { get; set; }

        /// <summary>
        /// User name
        /// </summary>
        /// <value>User name</value>
        [DataMember(Name = "username", IsRequired = true, EmitDefaultValue = true)]
        public string Username { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreAuthConfirmUserRequest {\n");
            sb.Append("  Secret: ").Append(Secret).Append("\n");
            sb.Append("  Username: ").Append(Username).Append("\n");
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
