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
    /// MediaVideojsGetLanguageRequest
    /// </summary>
    [DataContract(Name = "media_videojs_get_language_request")]
    public partial class MediaVideojsGetLanguageRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MediaVideojsGetLanguageRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected MediaVideojsGetLanguageRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="MediaVideojsGetLanguageRequest" /> class.
        /// </summary>
        /// <param name="lang">language (required) (default to &quot;null&quot;).</param>
        public MediaVideojsGetLanguageRequest(string lang = @"null")
        {
            // to ensure "lang" is required (not null)
            if (lang == null)
            {
                throw new ArgumentNullException("lang is a required property for MediaVideojsGetLanguageRequest and cannot be null");
            }
            this.Lang = lang;
        }

        /// <summary>
        /// language
        /// </summary>
        /// <value>language</value>
        [DataMember(Name = "lang", IsRequired = true, EmitDefaultValue = true)]
        public string Lang { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MediaVideojsGetLanguageRequest {\n");
            sb.Append("  Lang: ").Append(Lang).Append("\n");
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
