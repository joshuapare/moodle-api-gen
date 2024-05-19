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
    /// CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner
    /// </summary>
    [DataContract(Name = "core_message_get_user_message_preferences_200_response_preferences_components_inner_notifications_inner")]
    public partial class CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner" /> class.
        /// </summary>
        /// <param name="displayname">Display name.</param>
        /// <param name="preferencekey">Preference key (default to &quot;null&quot;).</param>
        /// <param name="processors">processors.</param>
        public CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner(string displayname = default(string), string preferencekey = @"null", List<CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner> processors = default(List<CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner>))
        {
            this.Displayname = displayname;
            // use default value if no "preferencekey" provided
            this.Preferencekey = preferencekey ?? @"null";
            this.Processors = processors;
        }

        /// <summary>
        /// Display name
        /// </summary>
        /// <value>Display name</value>
        [DataMember(Name = "displayname", EmitDefaultValue = false)]
        public string Displayname { get; set; }

        /// <summary>
        /// Preference key
        /// </summary>
        /// <value>Preference key</value>
        [DataMember(Name = "preferencekey", EmitDefaultValue = false)]
        public string Preferencekey { get; set; }

        /// <summary>
        /// Gets or Sets Processors
        /// </summary>
        [DataMember(Name = "processors", EmitDefaultValue = false)]
        public List<CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner> Processors { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner {\n");
            sb.Append("  Displayname: ").Append(Displayname).Append("\n");
            sb.Append("  Preferencekey: ").Append(Preferencekey).Append("\n");
            sb.Append("  Processors: ").Append(Processors).Append("\n");
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
