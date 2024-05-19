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
    /// CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner
    /// </summary>
    [DataContract(Name = "core_message_get_user_message_preferences_200_response_preferences_components_inner")]
    public partial class CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner" /> class.
        /// </summary>
        /// <param name="displayname">Display name (default to &quot;null&quot;).</param>
        /// <param name="notifications">notifications.</param>
        public CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner(string displayname = @"null", List<CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner> notifications = default(List<CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner>))
        {
            // use default value if no "displayname" provided
            this.Displayname = displayname ?? @"null";
            this.Notifications = notifications;
        }

        /// <summary>
        /// Display name
        /// </summary>
        /// <value>Display name</value>
        [DataMember(Name = "displayname", EmitDefaultValue = false)]
        public string Displayname { get; set; }

        /// <summary>
        /// Gets or Sets Notifications
        /// </summary>
        [DataMember(Name = "notifications", EmitDefaultValue = false)]
        public List<CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner> Notifications { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner {\n");
            sb.Append("  Displayname: ").Append(Displayname).Append("\n");
            sb.Append("  Notifications: ").Append(Notifications).Append("\n");
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
