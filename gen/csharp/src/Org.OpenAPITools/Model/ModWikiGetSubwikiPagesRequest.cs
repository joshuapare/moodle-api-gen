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
    /// ModWikiGetSubwikiPagesRequest
    /// </summary>
    [DataContract(Name = "mod_wiki_get_subwiki_pages_request")]
    public partial class ModWikiGetSubwikiPagesRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWikiGetSubwikiPagesRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModWikiGetSubwikiPagesRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWikiGetSubwikiPagesRequest" /> class.
        /// </summary>
        /// <param name="groupid">Subwiki&#39;s group ID, -1 means current group. It will be ignored if the wiki doesn&#39;t use groups. (default to -1).</param>
        /// <param name="options">options.</param>
        /// <param name="userid">Subwiki&#39;s user ID, 0 means current user. It will be ignored in collaborative wikis. (default to 0).</param>
        /// <param name="wikiid">Wiki instance ID. (required).</param>
        public ModWikiGetSubwikiPagesRequest(int groupid = -1, ModWikiGetSubwikiPagesRequestOptions options = default(ModWikiGetSubwikiPagesRequestOptions), int userid = 0, int wikiid = default(int))
        {
            this.Wikiid = wikiid;
            this.Groupid = groupid;
            this.Options = options;
            this.Userid = userid;
        }

        /// <summary>
        /// Subwiki&#39;s group ID, -1 means current group. It will be ignored if the wiki doesn&#39;t use groups.
        /// </summary>
        /// <value>Subwiki&#39;s group ID, -1 means current group. It will be ignored if the wiki doesn&#39;t use groups.</value>
        [DataMember(Name = "groupid", EmitDefaultValue = false)]
        public int Groupid { get; set; }

        /// <summary>
        /// Gets or Sets Options
        /// </summary>
        [DataMember(Name = "options", EmitDefaultValue = false)]
        public ModWikiGetSubwikiPagesRequestOptions Options { get; set; }

        /// <summary>
        /// Subwiki&#39;s user ID, 0 means current user. It will be ignored in collaborative wikis.
        /// </summary>
        /// <value>Subwiki&#39;s user ID, 0 means current user. It will be ignored in collaborative wikis.</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// Wiki instance ID.
        /// </summary>
        /// <value>Wiki instance ID.</value>
        [DataMember(Name = "wikiid", IsRequired = true, EmitDefaultValue = true)]
        public int Wikiid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModWikiGetSubwikiPagesRequest {\n");
            sb.Append("  Groupid: ").Append(Groupid).Append("\n");
            sb.Append("  Options: ").Append(Options).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
            sb.Append("  Wikiid: ").Append(Wikiid).Append("\n");
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
