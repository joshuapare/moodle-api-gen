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
    /// ModForumSetPinState200ResponseGroup
    /// </summary>
    [DataContract(Name = "mod_forum_set_pin_state_200_response_group")]
    public partial class ModForumSetPinState200ResponseGroup : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumSetPinState200ResponseGroup" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModForumSetPinState200ResponseGroup() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumSetPinState200ResponseGroup" /> class.
        /// </summary>
        /// <param name="name">name (required).</param>
        /// <param name="urls">urls (required).</param>
        public ModForumSetPinState200ResponseGroup(string name = default(string), ModForumSetPinState200ResponseGroupUrls urls = default(ModForumSetPinState200ResponseGroupUrls))
        {
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for ModForumSetPinState200ResponseGroup and cannot be null");
            }
            this.Name = name;
            // to ensure "urls" is required (not null)
            if (urls == null)
            {
                throw new ArgumentNullException("urls is a required property for ModForumSetPinState200ResponseGroup and cannot be null");
            }
            this.Urls = urls;
        }

        /// <summary>
        /// name
        /// </summary>
        /// <value>name</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Urls
        /// </summary>
        [DataMember(Name = "urls", IsRequired = true, EmitDefaultValue = true)]
        public ModForumSetPinState200ResponseGroupUrls Urls { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModForumSetPinState200ResponseGroup {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Urls: ").Append(Urls).Append("\n");
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
