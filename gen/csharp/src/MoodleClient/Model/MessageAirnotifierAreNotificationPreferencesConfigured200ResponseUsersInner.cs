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
    /// MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner
    /// </summary>
    [DataContract(Name = "message_airnotifier_are_notification_preferences_configured_200_response_users_inner")]
    public partial class MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner" /> class.
        /// </summary>
        /// <param name="configured">1 if the user preferences have been configured and 0 if not (default to null).</param>
        /// <param name="userid">userid id (default to null).</param>
        public MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner(int configured = null, int userid = null)
        {
            this.Configured = configured;
            this.Userid = userid;
        }

        /// <summary>
        /// 1 if the user preferences have been configured and 0 if not
        /// </summary>
        /// <value>1 if the user preferences have been configured and 0 if not</value>
        [DataMember(Name = "configured", EmitDefaultValue = false)]
        public int Configured { get; set; }

        /// <summary>
        /// userid id
        /// </summary>
        /// <value>userid id</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner {\n");
            sb.Append("  Configured: ").Append(Configured).Append("\n");
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