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
    /// CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff
    /// </summary>
    [DataContract(Name = "core_message_get_user_message_preferences_200_response_preferences_components_inner_notifications_inner_processors_inner_loggedoff")]
    public partial class CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff" /> class.
        /// </summary>
        /// <param name="varChecked">Is checked? (required).</param>
        /// <param name="displayname">Display name (required).</param>
        /// <param name="name">Name (required).</param>
        public CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff(bool varChecked = default(bool), string displayname = default(string), string name = default(string))
        {
            this.Checked = varChecked;
            // to ensure "displayname" is required (not null)
            if (displayname == null)
            {
                throw new ArgumentNullException("displayname is a required property for CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff and cannot be null");
            }
            this.Displayname = displayname;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff and cannot be null");
            }
            this.Name = name;
        }

        /// <summary>
        /// Is checked?
        /// </summary>
        /// <value>Is checked?</value>
        [DataMember(Name = "checked", IsRequired = true, EmitDefaultValue = true)]
        public bool Checked { get; set; }

        /// <summary>
        /// Display name
        /// </summary>
        /// <value>Display name</value>
        [DataMember(Name = "displayname", IsRequired = true, EmitDefaultValue = true)]
        public string Displayname { get; set; }

        /// <summary>
        /// Name
        /// </summary>
        /// <value>Name</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff {\n");
            sb.Append("  Checked: ").Append(Checked).Append("\n");
            sb.Append("  Displayname: ").Append(Displayname).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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