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
    /// ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner
    /// </summary>
    [DataContract(Name = "tool_mobile_get_plugins_supporting_mobile_200_response_plugins_inner")]
    public partial class ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner" /> class.
        /// </summary>
        /// <param name="addon">The Mobile addon (package) name. (default to &quot;null&quot;).</param>
        /// <param name="component">The plugin component name. (default to &quot;null&quot;).</param>
        /// <param name="dependencies">dependencies.</param>
        /// <param name="filehash">The addon package hash or empty if it doesn&#39;t exist. (default to &quot;null&quot;).</param>
        /// <param name="filesize">The addon package size or empty if it doesn&#39;t exist. (default to null).</param>
        /// <param name="fileurl">The addon package url for download                                                             or empty if it doesn&#39;t exist. (default to &quot;null&quot;).</param>
        /// <param name="handlers">Handlers definition (JSON) (default to &quot;null&quot;).</param>
        /// <param name="lang">Language strings used by the handlers (JSON) (default to &quot;null&quot;).</param>
        /// <param name="varVersion">The plugin version number. (default to &quot;null&quot;).</param>
        public ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner(string addon = @"null", string component = @"null", List<Object> dependencies = default(List<Object>), string filehash = @"null", int filesize = null, string fileurl = @"null", string handlers = @"null", string lang = @"null", string varVersion = @"null")
        {
            // use default value if no "addon" provided
            this.Addon = addon ?? @"null";
            // use default value if no "component" provided
            this.Component = component ?? @"null";
            this.Dependencies = dependencies;
            // use default value if no "filehash" provided
            this.Filehash = filehash ?? @"null";
            this.Filesize = filesize;
            // use default value if no "fileurl" provided
            this.Fileurl = fileurl ?? @"null";
            // use default value if no "handlers" provided
            this.Handlers = handlers ?? @"null";
            // use default value if no "lang" provided
            this.Lang = lang ?? @"null";
            // use default value if no "varVersion" provided
            this.VarVersion = varVersion ?? @"null";
        }

        /// <summary>
        /// The Mobile addon (package) name.
        /// </summary>
        /// <value>The Mobile addon (package) name.</value>
        [DataMember(Name = "addon", EmitDefaultValue = false)]
        public string Addon { get; set; }

        /// <summary>
        /// The plugin component name.
        /// </summary>
        /// <value>The plugin component name.</value>
        [DataMember(Name = "component", EmitDefaultValue = false)]
        public string Component { get; set; }

        /// <summary>
        /// Gets or Sets Dependencies
        /// </summary>
        [DataMember(Name = "dependencies", EmitDefaultValue = false)]
        public List<Object> Dependencies { get; set; }

        /// <summary>
        /// The addon package hash or empty if it doesn&#39;t exist.
        /// </summary>
        /// <value>The addon package hash or empty if it doesn&#39;t exist.</value>
        [DataMember(Name = "filehash", EmitDefaultValue = false)]
        public string Filehash { get; set; }

        /// <summary>
        /// The addon package size or empty if it doesn&#39;t exist.
        /// </summary>
        /// <value>The addon package size or empty if it doesn&#39;t exist.</value>
        [DataMember(Name = "filesize", EmitDefaultValue = false)]
        public int Filesize { get; set; }

        /// <summary>
        /// The addon package url for download                                                             or empty if it doesn&#39;t exist.
        /// </summary>
        /// <value>The addon package url for download                                                             or empty if it doesn&#39;t exist.</value>
        [DataMember(Name = "fileurl", EmitDefaultValue = false)]
        public string Fileurl { get; set; }

        /// <summary>
        /// Handlers definition (JSON)
        /// </summary>
        /// <value>Handlers definition (JSON)</value>
        [DataMember(Name = "handlers", EmitDefaultValue = false)]
        public string Handlers { get; set; }

        /// <summary>
        /// Language strings used by the handlers (JSON)
        /// </summary>
        /// <value>Language strings used by the handlers (JSON)</value>
        [DataMember(Name = "lang", EmitDefaultValue = false)]
        public string Lang { get; set; }

        /// <summary>
        /// The plugin version number.
        /// </summary>
        /// <value>The plugin version number.</value>
        [DataMember(Name = "version", EmitDefaultValue = false)]
        public string VarVersion { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner {\n");
            sb.Append("  Addon: ").Append(Addon).Append("\n");
            sb.Append("  Component: ").Append(Component).Append("\n");
            sb.Append("  Dependencies: ").Append(Dependencies).Append("\n");
            sb.Append("  Filehash: ").Append(Filehash).Append("\n");
            sb.Append("  Filesize: ").Append(Filesize).Append("\n");
            sb.Append("  Fileurl: ").Append(Fileurl).Append("\n");
            sb.Append("  Handlers: ").Append(Handlers).Append("\n");
            sb.Append("  Lang: ").Append(Lang).Append("\n");
            sb.Append("  VarVersion: ").Append(VarVersion).Append("\n");
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
